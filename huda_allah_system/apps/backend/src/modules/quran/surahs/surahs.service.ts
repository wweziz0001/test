import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Surah } from '../../../database/entities/quran.entities';

@Injectable()
export class SurahsService {
  constructor(
    @InjectRepository(Surah)
    private surahsRepository: Repository<Surah>,
  ) {}

  async findAll(): Promise<Surah[]> {
    return this.surahsRepository.find({
      order: { moshafOrder: 'ASC' },
    });
  }

  async findOne(id: number): Promise<Surah | null> {
    return this.surahsRepository.findOne({
      where: { id },
      relations: ['ayahs'],
    });
  }

  async findByMoshafOrder(order: number): Promise<Surah | null> {
    return this.surahsRepository.findOne({
      where: { moshafOrder: order },
    });
  }

  async findMakki(): Promise<Surah[]> {
    return this.surahsRepository.find({
      where: { fallPlace: 0 },
      order: { moshafOrder: 'ASC' },
    });
  }

  async findMadani(): Promise<Surah[]> {
    return this.surahsRepository.find({
      where: { fallPlace: 1 },
      order: { moshafOrder: 'ASC' },
    });
  }

  async getAyahsCount(id: number): Promise<number> {
    const surah = await this.surahsRepository.findOne({
      where: { id },
      select: ['ayahsCount'],
    });
    return surah?.ayahsCount || 0;
  }
}
