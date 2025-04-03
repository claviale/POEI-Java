import { Component } from '@angular/core';
import { VelosService } from '../../../services/velos.service';
import { Velo } from '../../../interfaces/velo';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-lecture',
  imports: [CommonModule],
  templateUrl: './lecture.component.html',
  styleUrl: './lecture.component.css'
})
export class LectureComponent {
  velos : Velo[];

  constructor(private service : VelosService) {
    this.velos = service.getVelos();
  }
}
