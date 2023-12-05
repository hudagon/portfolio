import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-sign-up-body',
  templateUrl: './login-sign-up-body.component.html',
  styleUrls: ['./login-sign-up-body.component.css']
})
export class LoginSignUpBodyComponent implements OnInit {
  constructor(
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.router.navigateByUrl('/feature/portfolio/about');
  }
}
