import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { EnfantComponent } from "../enfant/enfant.component";
import { Sport } from '../../../interfaces/sport';

@Component({
  selector: 'app-parent',
  imports: [CommonModule, EnfantComponent],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {
  sports : Sport[] = [
    {nom : "Judo", competitif : true, nature : "individuel"},
    {nom : "Roller derby", competitif : true, nature : "équipe"},
    {nom : "Basket", competitif : true, nature : "équipe"},
    {nom : "Gamibe", competitif : false, nature : "individuel"},
    {nom : "Tennis", competitif : true, nature : "individuel - équipe"}
  ]

  randomColor() {
    return '#'+(0x1000000+Math.random()*0xffffff).toString(16).substr(1,6);
  }

}
