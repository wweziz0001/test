import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { ConfigModule, ConfigService } from '@nestjs/config';
import { ServeStaticModule } from '@nestjs/serve-static';
import { join } from 'path';

// Entities
import { Surah, Ayah, Page, Juz, Hizb, Glyph, GlyphType } from './database/entities/quran.entities';
import { Reciter, Recitation, ReciterType, ReciterAudio, AyahAudio } from './database/entities/audio.entities';
import { 
  Lecturer, LecturerType, Lecture, Paragraph, Media, MediaType, 
  ParagraphMedia, Album, Tag, LectureInfo, LectureInfoType, 
  LectureUI, LectureGroup 
} from './database/entities/wiki.entities';

// Controllers
import { SurahsController } from './modules/quran/surahs/surahs.controller';
import { AyahsController } from './modules/quran/ayahs/ayahs.controller';
import { PagesController } from './modules/quran/pages/pages.controller';
import { JuzsController } from './modules/quran/juzs/juzs.controller';
import { HizbsController } from './modules/quran/hizbs/hizbs.controller';
import { RecitersController } from './modules/audio/reciters/reciters.controller';
import { LecturesController } from './modules/wiki/lectures/lectures.controller';
import { LecturersController } from './modules/wiki/lecturers/lecturers.controller';

// Services
import { SurahsService } from './modules/quran/surahs/surahs.service';
import { AyahsService } from './modules/quran/ayahs/ayahs.service';
import { PagesService } from './modules/quran/pages/pages.service';
import { JuzsService } from './modules/quran/juzs/juzs.service';
import { HizbsService } from './modules/quran/hizbs/hizbs.service';
import { RecitersService } from './modules/audio/reciters/reciters.service';
import { LecturesService } from './modules/wiki/lectures/lectures.service';
import { LecturersService } from './modules/wiki/lecturers/lecturers.service';

@Module({
  imports: [
    ConfigModule.forRoot({
      isGlobal: true,
      envFilePath: '.env',
    }),
    TypeOrmModule.forRootAsync({
      imports: [ConfigModule],
      useFactory: (configService: ConfigService) => ({
        type: 'better-sqlite3',
        database: configService.get('DATABASE_PATH') || join(__dirname, '..', '..', '..', 'database', 'main_db@2.sqlite'),
        entities: [
          Surah, Ayah, Page, Juz, Hizb, Glyph, GlyphType,
          Reciter, Recitation, ReciterType, ReciterAudio, AyahAudio,
          Lecturer, LecturerType, Lecture, Paragraph, Media, MediaType,
          ParagraphMedia, Album, Tag, LectureInfo, LectureInfoType,
          LectureUI, LectureGroup
        ],
        synchronize: false,
        logging: configService.get('NODE_ENV') === 'development',
      }),
      inject: [ConfigService],
    }),
    TypeOrmModule.forFeature([
      Surah, Ayah, Page, Juz, Hizb, Glyph, GlyphType,
      Reciter, Recitation, ReciterType, ReciterAudio, AyahAudio,
      Lecturer, LecturerType, Lecture, Paragraph, Media, MediaType,
      ParagraphMedia, Album, Tag, LectureInfo, LectureInfoType,
      LectureUI, LectureGroup
    ]),
  ],
  controllers: [
    SurahsController, AyahsController, PagesController, JuzsController, HizbsController,
    RecitersController, LecturesController, LecturersController
  ],
  providers: [
    SurahsService, AyahsService, PagesService, JuzsService, HizbsService,
    RecitersService, LecturesService, LecturersService
  ],
})
export class AppModule {}
