import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository, Like } from 'typeorm';
import { Lecture, Paragraph, Media, Tag, Lecturer, Album, LectureGroup } from '../../../database/entities/wiki.entities';

@Injectable()
export class LecturesService {
  constructor(
    @InjectRepository(Lecture)
    private lecturesRepository: Repository<Lecture>,
    @InjectRepository(Paragraph)
    private paragraphsRepository: Repository<Paragraph>,
    @InjectRepository(Media)
    private mediaRepository: Repository<Media>,
    @InjectRepository(Tag)
    private tagsRepository: Repository<Tag>,
    @InjectRepository(Album)
    private albumsRepository: Repository<Album>,
    @InjectRepository(LectureGroup)
    private lectureGroupsRepository: Repository<LectureGroup>,
  ) {}

  async findAll(page = 1, limit = 20): Promise<[Lecture[], number]> {
    return this.lecturesRepository.findAndCount({
      where: { deletedAt: undefined as any },
      relations: ['lecturer'],
      order: { ordr: 'DESC' },
      skip: (page - 1) * limit,
      take: limit,
    });
  }

  async findByLecturer(lecturerId: number): Promise<Lecture[]> {
    return this.lecturesRepository.find({
      where: { lecturerId, deletedAt: undefined as any },
      order: { ordr: 'DESC' },
    });
  }

  async findByAlbum(albumId: number): Promise<Lecture[]> {
    return this.lecturesRepository.find({
      where: { albumId, deletedAt: undefined as any },
      order: { ordr: 'DESC' },
    });
  }

  async findOne(id: number): Promise<Lecture | null> {
    return this.lecturesRepository.findOne({
      where: { id },
      relations: ['lecturer', 'album', 'tags'],
    });
  }

  async getParagraphs(lectureId: number): Promise<Paragraph[]> {
    return this.paragraphsRepository.find({
      where: { lectureId, deletedAt: undefined as any },
      order: { ordr: 'ASC' },
    });
  }

  async getMedia(lectureId: number): Promise<Media[]> {
    return this.mediaRepository.find({
      where: { lectureId, deletedAt: undefined as any },
      relations: ['mediaType'],
    });
  }

  async search(query: string): Promise<Lecture[]> {
    return this.lecturesRepository.find({
      where: [
        { title: Like(`%${query}%`), deletedAt: undefined as any },
        { keywords: Like(`%${query}%`), deletedAt: undefined as any },
        { shortContent: Like(`%${query}%`), deletedAt: undefined as any },
      ],
      take: 50,
    });
  }

  async incrementViews(id: number): Promise<void> {
    await this.lecturesRepository.increment({ id }, 'views', 1);
  }

  // Albums
  async findAllAlbums(): Promise<Album[]> {
    return this.albumsRepository.find({
      where: { deletedAt: undefined as any, isActive: true },
      relations: ['lecturer'],
      order: { ordr: 'ASC' },
    });
  }

  async findAlbum(id: number): Promise<Album | null> {
    return this.albumsRepository.findOne({
      where: { id },
      relations: ['lecturer', 'lectures'],
    });
  }

  // Tags
  async findAllTags(): Promise<Tag[]> {
    return this.tagsRepository.find({
      where: { deletedAt: undefined as any },
    });
  }

  async findLecturesByTag(tagId: number): Promise<Lecture[]> {
    const tag = await this.tagsRepository.findOne({
      where: { id: tagId },
      relations: ['lectures'],
    });
    return tag?.lectures || [];
  }

  // Lecture Groups
  async findAllGroups(): Promise<LectureGroup[]> {
    return this.lectureGroupsRepository.find({
      where: { deletedAt: undefined as any },
      order: { ordr: 'ASC' },
    });
  }
}
