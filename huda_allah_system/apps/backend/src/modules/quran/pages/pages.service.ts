import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Page } from '../../../database/entities/quran.entities';

@Injectable()
export class PagesService {
  constructor(
    @InjectRepository(Page)
    private pagesRepository: Repository<Page>,
  ) {}

  async findAll(): Promise<Page[]> {
    return this.pagesRepository.find({
      order: { pageNumber: 'ASC' },
    });
  }

  async findByNumber(pageNumber: number): Promise<Page | null> {
    return this.pagesRepository.findOne({
      where: { pageNumber },
    });
  }

  async findOne(id: number): Promise<Page | null> {
    return this.pagesRepository.findOne({
      where: { id },
    });
  }
}
