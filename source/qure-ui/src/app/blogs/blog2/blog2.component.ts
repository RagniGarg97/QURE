import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-blog2',
  templateUrl: './blog2.component.html',
  styleUrls: ['./blog2.component.scss']
})
export class Blog2Component implements OnInit {

  constructor() { }

  ngOnInit() {
    window.scrollTo(0, 0);
  }
}
