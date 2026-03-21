import { Controller, Get, Param, Query } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { AyahsService } from './ayahs.service';
import { Ayah } from '../../../database/entities/quran.entities';

@ApiTags('quran - القرآن الكريم')
@Controller('quran/ayahs')
export class AyahsController {
  constructor(private readonly ayahsService: AyahsService) {}

  @Get()
  @ApiOperation({ summary: 'البحث في الآيات' })
  search(@Query('q') query: string): Promise<Ayah[]> {
    return this.ayahsService.search(query);
  }

  @Get('surah/:surahId')
  @ApiOperation({ summary: 'آيات سورة معينة' })
  findBySurah(@Param('surahId') surahId: string): Promise<Ayah[]> {
    return this.ayahsService.findBySurahId(+surahId);
  }

  @Get('page/:pageId')
  @ApiOperation({ summary: 'آيات صفحة معينة' })
  findByPage(@Param('pageId') pageId: string): Promise<Ayah[]> {
    return this.ayahsService.findByPageId(+pageId);
  }

  @Get('juz/:juzId')
  @ApiOperation({ summary: 'آيات جزء معين' })
  findByJuz(@Param('juzId') juzId: string): Promise<Ayah[]> {
    return this.ayahsService.findByJuzId(+juzId);
  }

  @Get(':id')
  @ApiOperation({ summary: 'الحصول على آية بالمعرف' })
  findOne(@Param('id') id: string): Promise<Ayah | null> {
    return this.ayahsService.findOne(+id);
  }
}
