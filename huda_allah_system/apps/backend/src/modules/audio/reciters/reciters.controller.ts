import { Controller, Get, Param } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { RecitersService } from './reciters.service';

@ApiTags('audio - الصوتيات')
@Controller('audio')
export class RecitersController {
  constructor(private readonly recitersService: RecitersService) {}

  @Get('reciters')
  @ApiOperation({ summary: 'جميع القراء' })
  findAllReciters() {
    return this.recitersService.findAllReciters();
  }

  @Get('reciters/:id')
  @ApiOperation({ summary: 'قارئ بالمعرف' })
  findReciter(@Param('id') id: string) {
    return this.recitersService.findReciter(+id);
  }

  @Get('recitations')
  @ApiOperation({ summary: 'أنواع التلاوة' })
  findAllRecitations() {
    return this.recitersService.findAllRecitations();
  }

  @Get('reciters/:id/types')
  @ApiOperation({ summary: 'أنواع القارئ' })
  findReciterTypes(@Param('id') id: string) {
    return this.recitersService.findReciterTypes(+id);
  }

  @Get('reciters/:id/audios')
  @ApiOperation({ summary: 'ملفات القارئ الصوتية' })
  findReciterAudios(@Param('id') id: string) {
    return this.recitersService.findReciterAudios(+id);
  }

  @Get('reciters/:reciterId/surah/:surahId')
  @ApiOperation({ summary: 'ملف صوتي لسورة معينة' })
  findSurahAudio(
    @Param('reciterId') reciterId: string,
    @Param('surahId') surahId: string,
  ) {
    return this.recitersService.findSurahAudio(+reciterId, +surahId);
  }

  @Get('audio-files/:id/ayahs')
  @ApiOperation({ summary: 'توقيتات الآيات' })
  findAyahAudios(@Param('id') id: string) {
    return this.recitersService.findAyahAudios(+id);
  }
}
