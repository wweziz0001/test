import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Lecturer, LecturerType } from '../../../database/entities/wiki.entities';

@Injectable()
export class LecturersService {
  constructor(
    @InjectRepository(Lecturer)
    private lecturersRepository: Repository<Lecturer>,
    @InjectRepository(LecturerType)
    private lecturerTypesRepository: Repository<LecturerType>,
  ) {}

  async findAll(): Promise<Lecturer[]> {
    return this.lecturersRepository.find({
      where: { deletedAt: undefined as any },
      order: { name: 'ASC' },
    });
  }

  async findOne(id: number): Promise<Lecturer | null> {
    return this.lecturersRepository.findOne({
      where: { id },
      relations: ['lecturerTypes', 'lectures', 'albums'],
    });
  }

  async findByType(typeId: number): Promise<Lecturer[]> {
    return this.lecturersRepository
      .createQueryBuilder('lecturer')
      .innerJoin('lecturer.lecturerTypes', 'type')
      .where('type.id = :typeId', { typeId })
      .getMany();
  }

  async findAllTypes(): Promise<LecturerType[]> {
    return this.lecturerTypesRepository.find();
  }
}
