import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-portolifo-body',
  templateUrl: './portolifo-body.component.html',
  styleUrls: ['./portolifo-body.component.css']
})
export class PortolifoBodyComponent implements OnInit {
  currentRoute: string = '';

  constructor(
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.currentRoute = 'about';
  }

  changeRoute(route: string) {
    this.currentRoute = route;
    this.router.navigateByUrl('/feature/portfolio/' + route);
  }
}
