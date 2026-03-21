import { Controller, Get, Param } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { HizbsService } from './hizbs.service';

@ApiTags('quran - القرآن الكريم')
@Controller('quran/hizbs')
export class HizbsController {
  constructor(private readonly hizbsService: HizbsService) {}

  @Get()
  @ApiOperation({ summary: 'جميع الأحزاب' })
  findAll() {
    return this.hizbsService.findAll();
  }

  @Get(':id')
  @ApiOperation({ summary: 'حزب بالمعرف' })
  findOne(@Param('id') id: string) {
    return this.hizbsService.findOne(+id);
  }
}
