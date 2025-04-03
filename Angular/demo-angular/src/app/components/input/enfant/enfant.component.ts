import { Component, Input } from '@angular/core';
import { Sport } from '../../../interfaces/sport';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-enfant',
  imports: [CommonModule],
  templateUrl: './enfant.component.html',
  styleUrl: './enfant.component.css'
})
export class EnfantComponent {
  @Input()
  discipline ?: Sport;

  @Input()
  color : string = "#000000" ;
}
