import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Hizb } from '../../../database/entities/quran.entities';

@Injectable()
export class HizbsService {
  constructor(
    @InjectRepository(Hizb)
    private hizbsRepository: Repository<Hizb>,
  ) {}

  async findAll(): Promise<Hizb[]> {
    return this.hizbsRepository.find({
      order: { hizbNumber: 'ASC', segmentOrder: 'ASC' },
    });
  }

  async findOne(id: number): Promise<Hizb | null> {
    return this.hizbsRepository.findOne({
      where: { id },
    });
  }
}
