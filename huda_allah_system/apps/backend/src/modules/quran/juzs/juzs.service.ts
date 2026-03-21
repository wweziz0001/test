import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Juz } from '../../../database/entities/quran.entities';

@Injectable()
export class JuzsService {
  constructor(
    @InjectRepository(Juz)
    private juzsRepository: Repository<Juz>,
  ) {}

  async findAll(): Promise<Juz[]> {
    return this.juzsRepository.find({
      order: { juzNumber: 'ASC' },
    });
  }

  async findByNumber(juzNumber: number): Promise<Juz | null> {
    return this.juzsRepository.findOne({
      where: { juzNumber },
    });
  }

  async findOne(id: number): Promise<Juz | null> {
    return this.juzsRepository.findOne({
      where: { id },
    });
  }
}
