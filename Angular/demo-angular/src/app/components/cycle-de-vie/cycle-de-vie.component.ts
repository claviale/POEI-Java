import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-cycle-de-vie',
  imports: [],
  templateUrl: './cycle-de-vie.component.html',
  styleUrl: './cycle-de-vie.component.css'
})
export class CycleDeVieComponent implements OnInit, OnChanges, AfterViewInit, AfterViewChecked, AfterContentInit, AfterContentChecked {
  ngOnInit(): void {
    console.log("ngOnInit");
  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log("ngOnChanges");
  }
  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
  }
  ngAfterViewChecked(): void {
    console.log("ngAfterViewChecked");
  }
  ngAfterContentInit(): void {
    console.log("ngAfterContentInit");
  }
  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked");
  }
}
