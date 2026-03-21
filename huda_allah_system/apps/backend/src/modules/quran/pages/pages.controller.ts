import { Controller, Get, Param } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { PagesService } from './pages.service';

@ApiTags('quran - القرآن الكريم')
@Controller('quran/pages')
export class PagesController {
  constructor(private readonly pagesService: PagesService) {}

  @Get()
  @ApiOperation({ summary: 'جميع صفحات المصحف' })
  findAll() {
    return this.pagesService.findAll();
  }

  @Get('number/:number')
  @ApiOperation({ summary: 'صفحة بالرقم' })
  findByNumber(@Param('number') number: string) {
    return this.pagesService.findByNumber(+number);
  }

  @Get(':id')
  @ApiOperation({ summary: 'صفحة بالمعرف' })
  findOne(@Param('id') id: string) {
    return this.pagesService.findOne(+id);
  }
}
