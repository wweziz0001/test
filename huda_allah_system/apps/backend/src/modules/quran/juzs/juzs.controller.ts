import { Controller, Get, Param } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { JuzsService } from './juzs.service';

@ApiTags('quran - القرآن الكريم')
@Controller('quran/juzs')
export class JuzsController {
  constructor(private readonly juzsService: JuzsService) {}

  @Get()
  @ApiOperation({ summary: 'جميع الأجزاء' })
  findAll() {
    return this.juzsService.findAll();
  }

  @Get('number/:number')
  @ApiOperation({ summary: 'جزء بالرقم' })
  findByNumber(@Param('number') number: string) {
    return this.juzsService.findByNumber(+number);
  }

  @Get(':id')
  @ApiOperation({ summary: 'جزء بالمعرف' })
  findOne(@Param('id') id: string) {
    return this.juzsService.findOne(+id);
  }
}
