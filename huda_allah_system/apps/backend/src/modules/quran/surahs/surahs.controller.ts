import { Controller, Get, Param } from '@nestjs/common';
import { ApiTags, ApiOperation, ApiResponse } from '@nestjs/swagger';
import { SurahsService } from './surahs.service';
import { Surah } from '../../../database/entities/quran.entities';

@ApiTags('quran - القرآن الكريم')
@Controller('quran/surahs')
export class SurahsController {
  constructor(private readonly surahsService: SurahsService) {}

  @Get()
  @ApiOperation({ summary: 'الحصول على جميع السور', description: 'Get all Quran surahs' })
  @ApiResponse({ status: 200, description: 'قائمة السور', type: [Surah] })
  findAll(): Promise<Surah[]> {
    return this.surahsService.findAll();
  }

  @Get('makki')
  @ApiOperation({ summary: 'السور المكية', description: 'Get Makki surahs' })
  findMakki(): Promise<Surah[]> {
    return this.surahsService.findMakki();
  }

  @Get('madani')
  @ApiOperation({ summary: 'السور المدنية', description: 'Get Madani surahs' })
  findMadani(): Promise<Surah[]> {
    return this.surahsService.findMadani();
  }

  @Get(':id')
  @ApiOperation({ summary: 'الحصول على سورة بالمعرف', description: 'Get surah by ID' })
  @ApiResponse({ status: 200, description: 'السورة', type: Surah })
  findOne(@Param('id') id: string): Promise<Surah | null> {
    return this.surahsService.findOne(+id);
  }

  @Get('order/:order')
  @ApiOperation({ summary: 'الحصول على سورة بالترتيب', description: 'Get surah by order in Quran' })
  findByOrder(@Param('order') order: string): Promise<Surah | null> {
    return this.surahsService.findByMoshafOrder(+order);
  }
}
