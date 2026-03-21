import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Reciter, Recitation, ReciterType, ReciterAudio, AyahAudio } from '../../../database/entities/audio.entities';

@Injectable()
export class RecitersService {
  constructor(
    @InjectRepository(Reciter)
    private recitersRepository: Repository<Reciter>,
    @InjectRepository(Recitation)
    private recitationsRepository: Repository<Recitation>,
    @InjectRepository(ReciterType)
    private reciterTypesRepository: Repository<ReciterType>,
    @InjectRepository(ReciterAudio)
    private reciterAudiosRepository: Repository<ReciterAudio>,
    @InjectRepository(AyahAudio)
    private ayahAudiosRepository: Repository<AyahAudio>,
  ) {}

  async findAllReciters(): Promise<Reciter[]> {
    return this.recitersRepository.find({
      where: { deletedAt: undefined as any },
      order: { name: 'ASC' },
    });
  }

  async findReciter(id: number): Promise<Reciter | null> {
    return this.recitersRepository.findOne({
      where: { id },
    });
  }

  async findAllRecitations(): Promise<Recitation[]> {
    return this.recitationsRepository.find({
      where: { deletedAt: undefined as any },
    });
  }

  async findReciterTypes(reciterId: number): Promise<ReciterType[]> {
    return this.reciterTypesRepository.find({
      where: { reciterId, deletedAt: undefined as any },
      relations: ['recitation'],
    });
  }

  async findReciterAudios(reciterId: number): Promise<ReciterAudio[]> {
    return this.reciterAudiosRepository.find({
      where: { reciterId, deletedAt: undefined as any },
      relations: ['surah'],
    });
  }

  async findSurahAudio(reciterId: number, surahId: number): Promise<ReciterAudio | null> {
    return this.reciterAudiosRepository.findOne({
      where: { reciterId, surahId, deletedAt: undefined as any },
    });
  }

  async findAyahAudios(reciterAudioId: number): Promise<AyahAudio[]> {
    return this.ayahAudiosRepository.find({
      where: { reciterAudioId, deletedAt: undefined as any },
      order: { ayahOrder: 'ASC' },
    });
  }
}
