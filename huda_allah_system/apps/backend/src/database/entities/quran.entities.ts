import { Entity, PrimaryGeneratedColumn, Column, ManyToOne, OneToMany, JoinColumn } from 'typeorm';

@Entity('quran_surah')
export class Surah {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'juz_id', nullable: true, type: 'bigint' })
  juzId: number;

  @Column({ name: 'page_id', nullable: true, type: 'bigint' })
  pageId: number;

  @Column({ name: 'fall_order', nullable: true, type: 'int', unsigned: true })
  fallOrder: number;

  @Column({ name: 'moshaf_order', nullable: true, type: 'int', unsigned: true })
  moshafOrder: number;

  @Column({ name: 'ayahs_count', nullable: true, type: 'int', unsigned: true })
  ayahsCount: number;

  @Column({ name: 'fall_place', nullable: true })
  fallPlace: number; // 0 = مكية, 1 = مدنية

  @Column({ length: 50 })
  title: string;

  @Column({ nullable: true, type: 'text' })
  names: string;

  @Column({ nullable: true, type: 'text' })
  info: string;

  @Column({ length: 5 })
  symbol: string;

  @Column({ name: 'start_ayah_order', nullable: true, type: 'int', unsigned: true })
  startAyahOrder: number;

  // Relations
  @OneToMany(() => Ayah, ayah => ayah.surah)
  ayahs: Ayah[];

  @ManyToOne(() => Juz, juz => juz.surahs)
  @JoinColumn({ name: 'juz_id' })
  juz: Juz;

  @ManyToOne(() => Page, page => page.surahs)
  @JoinColumn({ name: 'page_id' })
  page: Page;

  // Computed properties
  get isMakki(): boolean {
    return this.fallPlace === 0;
  }

  get isMadani(): boolean {
    return this.fallPlace === 1;
  }
}

@Entity('quran_ayah')
export class Ayah {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'surah_id', nullable: true, type: 'bigint' })
  surahId: number;

  @Column({ name: 'juz_id', nullable: true, type: 'bigint' })
  juzId: number;

  @Column({ name: 'hizb_id', nullable: true, type: 'bigint' })
  hizbId: number;

  @Column({ name: 'page_id', nullable: true, type: 'bigint' })
  pageId: number;

  @Column({ name: 'hizb_number', nullable: true, type: 'int', unsigned: true })
  hizbNumber: number;

  @Column({ name: 'ayah_order', nullable: true, type: 'int', unsigned: true })
  ayahOrder: number;

  @Column({ name: 'ayah_number', nullable: true, type: 'int', unsigned: true })
  ayahNumber: number;

  @Column({ name: 'is_start_hizb', default: false })
  isStartHizb: boolean;

  @Column({ name: 'is_start_juz', default: false })
  isStartJuz: boolean;

  @Column({ name: 'has_prostration', default: false })
  hasProstration: boolean;

  @Column({ name: 'prostration_type', nullable: true, type: 'int', unsigned: true })
  prostrationType: number;

  @Column({ name: 'plain_text', nullable: true, type: 'text' })
  plainText: string;

  @Column({ name: 'quran_text', nullable: true, type: 'text' })
  quranText: string;

  @Column({ nullable: true, type: 'text' })
  stem: string;

  // Relations
  @ManyToOne(() => Surah, surah => surah.ayahs)
  @JoinColumn({ name: 'surah_id' })
  surah: Surah;

  @ManyToOne(() => Juz, juz => juz.ayahs)
  @JoinColumn({ name: 'juz_id' })
  juz: Juz;

  @ManyToOne(() => Hizb, hizb => hizb.ayahs)
  @JoinColumn({ name: 'hizb_id' })
  hizb: Hizb;

  @ManyToOne(() => Page, page => page.ayahs)
  @JoinColumn({ name: 'page_id' })
  page: Page;
}

@Entity('quran_page')
export class Page {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'start_surah_id', nullable: true, type: 'bigint' })
  startSurahId: number;

  @Column({ name: 'start_juz_id', nullable: true, type: 'bigint' })
  startJuzId: number;

  @Column({ name: 'start_hizb_id', nullable: true, type: 'bigint' })
  startHizbId: number;

  @Column({ name: 'hizb_number', nullable: true, type: 'int', unsigned: true })
  hizbNumber: number;

  @Column({ name: 'page_number', nullable: true, type: 'int', unsigned: true })
  pageNumber: number;

  @Column({ name: 'start_ayah_number', nullable: true, type: 'int', unsigned: true })
  startAyahNumber: number;

  @Column({ name: 'start_ayah_order', nullable: true, type: 'int', unsigned: true })
  startAyahOrder: number;

  // Relations
  @OneToMany(() => Surah, surah => surah.page)
  surahs: Surah[];

  @OneToMany(() => Ayah, ayah => ayah.page)
  ayahs: Ayah[];
}

@Entity('quran_juz')
export class Juz {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'start_surah_id', nullable: true, type: 'bigint' })
  startSurahId: number;

  @Column({ name: 'start_page_id', nullable: true, type: 'bigint' })
  startPageId: number;

  @Column({ name: 'juz_number', nullable: true, type: 'int', unsigned: true })
  juzNumber: number;

  @Column({ name: 'start_ayah_number', nullable: true, type: 'int', unsigned: true })
  startAyahNumber: number;

  @Column({ name: 'first_ayahs', nullable: true, type: 'text' })
  firstAyahs: string;

  @Column({ name: 'start_ayah_order', nullable: true, type: 'int', unsigned: true })
  startAyahOrder: number;

  // Relations
  @OneToMany(() => Surah, surah => surah.juz)
  surahs: Surah[];

  @OneToMany(() => Ayah, ayah => ayah.juz)
  ayahs: Ayah[];
}

@Entity('quran_hizb')
export class Hizb {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'juz_id', nullable: true, type: 'bigint' })
  juzId: number;

  @Column({ name: 'surah_id', nullable: true, type: 'bigint' })
  surahId: number;

  @Column({ name: 'start_page_id', nullable: true, type: 'bigint' })
  startPageId: number;

  @Column({ name: 'hizb_number', nullable: true, type: 'int', unsigned: true })
  hizbNumber: number;

  @Column({ name: 'segment_order', nullable: true, type: 'int', unsigned: true })
  segmentOrder: number;

  @Column({ name: 'ayah_number', nullable: true, type: 'int', unsigned: true })
  ayahNumber: number;

  @Column({ name: 'first_ayahs', nullable: true, type: 'text' })
  firstAyahs: string;

  @Column({ name: 'start_ayah_order', nullable: true, type: 'int', unsigned: true })
  startAyahOrder: number;

  @Column({ name: 'approval_status', nullable: true })
  approvalStatus: number;

  // Relations
  @OneToMany(() => Ayah, ayah => ayah.hizb)
  ayahs: Ayah[];

  // Computed
  get segmentName(): string {
    const names = ['الربع الأول', 'النصف', 'الثلث', 'الربع الأخير'];
    return names[this.segmentOrder - 1] || '';
  }
}
