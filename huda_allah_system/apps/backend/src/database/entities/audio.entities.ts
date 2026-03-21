import { Entity, PrimaryGeneratedColumn, Column, ManyToOne, OneToMany, JoinColumn } from 'typeorm';

@Entity('quran_reciter')
export class Reciter {
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

  @Column({ name: 'is_complete', default: false })
  isComplete: boolean;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'country_id', nullable: true, type: 'bigint' })
  countryId: number;

  @Column({ length: 100, nullable: true })
  profile: string;

  // Relations
  @OneToMany(() => ReciterType, reciterType => reciterType.reciter)
  reciterTypes: ReciterType[];

  @OneToMany(() => ReciterAudio, reciterAudio => reciterAudio.reciter)
  reciterAudios: ReciterAudio[];
}

@Entity('quran_recitation')
export class Recitation {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ length: 50 })
  name: string;

  @Column({ name: 'is_active', default: false })
  isActive: boolean;

  // Relations
  @OneToMany(() => ReciterType, reciterType => reciterType.recitation)
  reciterTypes: ReciterType[];
}

@Entity('quran_recitertype')
export class ReciterType {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ name: 'reciter_id', nullable: true, type: 'bigint' })
  reciterId: number;

  @Column({ name: 'recitation_id', nullable: true, type: 'bigint' })
  recitationId: number;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  // Relations
  @ManyToOne(() => Reciter, reciter => reciter.reciterTypes)
  @JoinColumn({ name: 'reciter_id' })
  reciter: Reciter;

  @ManyToOne(() => Recitation, recitation => recitation.reciterTypes)
  @JoinColumn({ name: 'recitation_id' })
  recitation: Recitation;

  @OneToMany(() => ReciterAudio, reciterAudio => reciterAudio.reciterType)
  reciterAudios: ReciterAudio[];
}

@Entity('quran_reciteraudio')
export class ReciterAudio {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ name: 'reciter_id', nullable: true, type: 'bigint' })
  reciterId: number;

  @Column({ name: 'surah_id', nullable: true, type: 'bigint' })
  surahId: number;

  @Column({ name: 'reciter_type_id', nullable: true, type: 'bigint' })
  reciterTypeId: number;

  @Column({ length: 100 })
  audio: string;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  @Column({ name: 'is_complete', default: false })
  isComplete: boolean;

  // Relations
  @ManyToOne(() => Reciter, reciter => reciter.reciterAudios)
  @JoinColumn({ name: 'reciter_id' })
  reciter: Reciter;

  @ManyToOne(() => ReciterType, reciterType => reciterType.reciterAudios)
  @JoinColumn({ name: 'reciter_type_id' })
  reciterType: ReciterType;

  @OneToMany(() => AyahAudio, ayahAudio => ayahAudio.reciterAudio)
  ayahAudios: AyahAudio[];
}

@Entity('quran_ayahaudio')
export class AyahAudio {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'deleted_at', nullable: true, type: 'datetime' })
  deletedAt: Date;

  @Column({ name: 'created_at', nullable: true, type: 'datetime' })
  createdAt: Date;

  @Column({ name: 'updated_at', nullable: true, type: 'datetime' })
  updatedAt: Date;

  @Column({ name: 'reciter_audio_id', nullable: true, type: 'bigint' })
  reciterAudioId: number;

  @Column({ name: 'reciter_id', nullable: true, type: 'bigint' })
  reciterId: number;

  @Column({ name: 'surah_id', nullable: true, type: 'bigint' })
  surahId: number;

  @Column({ name: 'ayah_id', nullable: true, type: 'bigint' })
  ayahId: number;

  @Column({ name: 'ayah_order', nullable: true, type: 'int', unsigned: true })
  ayahOrder: number;

  @Column({ name: 'reciter_type_id', nullable: true, type: 'bigint' })
  reciterTypeId: number;

  @Column({ length: 100 })
  audio: string;

  @Column({ name: 'start_time', nullable: true, type: 'bigint', unsigned: true })
  startTime: number; // milliseconds

  @Column({ name: 'end_time', nullable: true, type: 'bigint', unsigned: true })
  endTime: number; // milliseconds

  // Relations
  @ManyToOne(() => ReciterAudio, reciterAudio => reciterAudio.ayahAudios)
  @JoinColumn({ name: 'reciter_audio_id' })
  reciterAudio: ReciterAudio;
}
