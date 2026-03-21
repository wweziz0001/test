import { Entity, PrimaryGeneratedColumn, Column, ManyToOne, OneToMany, ManyToMany, JoinColumn, JoinTable } from 'typeorm';
import { ReciterAudio } from './audio.entities';

@Entity('quran_wiki_lecturer')
export class Lecturer {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  @Column({ name: 'full_name', nullable: true, type: 'text' })
  fullName: string;

  @Column({ length: 100, nullable: true })
  profile: string;

  @Column({ nullable: true, type: 'text' })
  code: string;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'is_complete', default: false })
  isComplete: boolean;

  // Relations
  @OneToMany(() => Lecture, lecture => lecture.lecturer)
  lectures: Lecture[];

  @OneToMany(() => Album, album => album.lecturer)
  albums: Album[];

  @ManyToMany(() => LecturerType, lecturerType => lecturerType.lecturers)
  @JoinTable({
    name: 'quran_wiki_lecturer_types',
    joinColumn: { name: 'lecturer_id' },
    inverseJoinColumn: { name: 'lecturertype_id' }
  })
  lecturerTypes: LecturerType[];
}

@Entity('quran_wiki_lecturertype')
export class LecturerType {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ name: 'display_name', nullable: true, type: 'text' })
  displayName: string;

  @Column({ nullable: true, type: 'text' })
  code: string;

  // Relations
  @ManyToMany(() => Lecturer, lecturer => lecturer.lecturerTypes)
  lecturers: Lecturer[];
}

@Entity('quran_wiki_lecture')
export class Lecture {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  title: string;

  @Column({ nullable: true, type: 'text' })
  keywords: string;

  @Column({ name: 'short_content', nullable: true, type: 'text' })
  shortContent: string;

  @Column({ nullable: true, type: 'date' })
  date: Date;

  @Column({ nullable: true })
  ordr: number;

  @Column({ length: 100, nullable: true })
  cover: string;

  @Column({ nullable: true, type: 'bigint', unsigned: true })
  views: number;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'is_complete', default: false })
  isComplete: boolean;

  @Column({ name: 'lecturer_id', nullable: true, type: 'bigint' })
  lecturerId: number;

  @Column({ name: 'album_id', nullable: true, type: 'bigint' })
  albumId: number;

  // Relations
  @ManyToOne(() => Lecturer, lecturer => lecturer.lectures)
  @JoinColumn({ name: 'lecturer_id' })
  lecturer: Lecturer;

  @ManyToOne(() => Album, album => album.lectures)
  @JoinColumn({ name: 'album_id' })
  album: Album;

  @OneToMany(() => Paragraph, paragraph => paragraph.lecture)
  paragraphs: Paragraph[];

  @OneToMany(() => Media, media => media.lecture)
  media: Media[];

  @OneToMany(() => LectureInfo, lectureInfo => lectureInfo.lecture)
  lectureInfo: LectureInfo[];

  @ManyToMany(() => Tag, tag => tag.lectures)
  @JoinTable({
    name: 'quran_wiki_tag_lectures',
    joinColumn: { name: 'lecture_id' },
    inverseJoinColumn: { name: 'tag_id' }
  })
  tags: Tag[];
}

@Entity('quran_wiki_paragraph')
export class Paragraph {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ name: 'lecture_id', nullable: true, type: 'bigint' })
  lectureId: number;

  @Column({ nullable: true, type: 'text' })
  title: string;

  @Column({ nullable: true })
  ordr: number;

  @Column({ name: 'formatted_content', nullable: true, type: 'text' })
  formattedContent: string;

  @Column({ nullable: true, type: 'text' })
  content: string;

  @Column({ name: 'plain_content', nullable: true, type: 'text' })
  plainContent: string;

  @Column({ name: 'start_page_number', nullable: true, type: 'int', unsigned: true })
  startPageNumber: number;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  // Relations
  @ManyToOne(() => Lecture, lecture => lecture.paragraphs)
  @JoinColumn({ name: 'lecture_id' })
  lecture: Lecture;

  @OneToMany(() => ParagraphMedia, paragraphMedia => paragraphMedia.paragraph)
  paragraphMedia: ParagraphMedia[];
}

@Entity('quran_wiki_media')
export class Media {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  @Column({ length: 100, nullable: true })
  media: string;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'album_id', nullable: true, type: 'bigint' })
  albumId: number;

  @Column({ name: 'lecture_id', nullable: true, type: 'bigint' })
  lectureId: number;

  @Column({ name: 'media_type_id', nullable: true, type: 'bigint' })
  mediaTypeId: number;

  // Relations
  @ManyToOne(() => Lecture, lecture => lecture.media)
  @JoinColumn({ name: 'lecture_id' })
  lecture: Lecture;

  @ManyToOne(() => MediaType, mediaType => mediaType.media)
  @JoinColumn({ name: 'media_type_id' })
  mediaType: MediaType;
}

@Entity('quran_wiki_mediatype')
export class MediaType {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  @Column({ nullable: true, type: 'text' })
  extensions: string;

  @Column({ nullable: true, type: 'text' })
  code: string;

  // Relations
  @OneToMany(() => Media, media => media.mediaType)
  media: Media[];
}

@Entity('quran_wiki_paragraphmedia')
export class ParagraphMedia {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ name: 'start_at', nullable: true, type: 'bigint', unsigned: true })
  startAt: number;

  @Column({ name: 'end_at', nullable: true, type: 'bigint', unsigned: true })
  endAt: number;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'media_id', nullable: true, type: 'bigint' })
  mediaId: number;

  @Column({ name: 'paragraph_id', nullable: true, type: 'bigint' })
  paragraphId: number;

  // Relations
  @ManyToOne(() => Media, media => media.id)
  @JoinColumn({ name: 'media_id' })
  media: Media;

  @ManyToOne(() => Paragraph, paragraph => paragraph.paragraphMedia)
  @JoinColumn({ name: 'paragraph_id' })
  paragraph: Paragraph;
}

@Entity('quran_wiki_album')
export class Album {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  @Column({ nullable: true })
  ordr: number;

  @Column({ length: 100, nullable: true })
  cover: string;

  @Column({ name: 'is_active', default: false })
  isActive: boolean;

  @Column({ name: 'lecturer_id', nullable: true, type: 'bigint' })
  lecturerId: number;

  @Column({ name: 'lecturer_type_id', nullable: true, type: 'bigint' })
  lecturerTypeId: number;

  @Column({ name: 'album_id', nullable: true, type: 'bigint' })
  albumId: number;

  // Relations
  @ManyToOne(() => Lecturer, lecturer => lecturer.albums)
  @JoinColumn({ name: 'lecturer_id' })
  lecturer: Lecturer;

  @OneToMany(() => Lecture, lecture => lecture.album)
  lectures: Lecture[];
}

@Entity('quran_wiki_tag')
export class Tag {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  // Relations
  @ManyToMany(() => Lecture, lecture => lecture.tags)
  lectures: Lecture[];
}

@Entity('quran_wiki_lectureinfo')
export class LectureInfo {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  value: string;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'lecture_id', nullable: true, type: 'bigint' })
  lectureId: number;

  @Column({ name: 'lecture_info_type_id', nullable: true, type: 'bigint' })
  lectureInfoTypeId: number;

  // Relations
  @ManyToOne(() => Lecture, lecture => lecture.lectureInfo)
  @JoinColumn({ name: 'lecture_id' })
  lecture: Lecture;
}

@Entity('quran_wiki_lectureinfotype')
export class LectureInfoType {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  @Column({ nullable: true, type: 'text' })
  code: string;
}

@Entity('quran_wiki_lectureui')
export class LectureUI {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ length: 50 })
  code: string;

  @Column({ length: 50 })
  name: string;

  @Column({ length: 100, nullable: true })
  cover: string;

  @Column({ nullable: true, type: 'text' })
  description: string;

  @Column({ name: 'is_active', default: false })
  isActive: boolean;
}

@Entity('quran_wiki_lecturegroup')
export class LectureGroup {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ nullable: true, type: 'text' })
  name: string;

  @Column({ nullable: true })
  ordr: number;

  @Column({ length: 100, nullable: true })
  cover: string;

  @Column({ name: 'lecturer_id', nullable: true, type: 'bigint' })
  lecturerId: number;

  @Column({ name: 'lecture_group_id', nullable: true, type: 'bigint' })
  lectureGroupId: number;

  @Column({ name: 'lecture_ui_id', nullable: true, type: 'bigint' })
  lectureUiId: number;
}
