import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository, Like } from 'typeorm';
import { Ayah } from '../../../database/entities/quran.entities';

@Injectable()
export class AyahsService {
  constructor(
    @InjectRepository(Ayah)
    private ayahsRepository: Repository<Ayah>,
  ) {}

  async findBySurahId(surahId: number): Promise<Ayah[]> {
    return this.ayahsRepository.find({
      where: { surahId },
      order: { ayahOrder: 'ASC' },
    });
  }

  async findByPageId(pageId: number): Promise<Ayah[]> {
    return this.ayahsRepository.find({
      where: { pageId },
      order: { ayahOrder: 'ASC' },
    });
  }

  async findOne(id: number): Promise<Ayah | null> {
    return this.ayahsRepository.findOne({
      where: { id },
      relations: ['surah'],
    });
  }

  async search(query: string): Promise<Ayah[]> {
    return this.ayahsRepository.find({
      where: [
        { plainText: Like(`%${query}%`) },
        { quranText: Like(`%${query}%`) },
        { stem: Like(`%${query}%`) },
      ],
      take: 100,
    });
  }

  async findByJuzId(juzId: number): Promise<Ayah[]> {
    return this.ayahsRepository.find({
      where: { juzId },
      order: { ayahOrder: 'ASC' },
    });
  }

  async findByHizbId(hizbId: number): Promise<Ayah[]> {
    return this.ayahsRepository.find({
      where: { hizbId },
      order: { ayahOrder: 'ASC' },
    });
  }

  async getAyahsCount(): Promise<number> {
    return this.ayahsRepository.count();
  }
}
