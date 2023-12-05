import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginSignUpRoutingModule } from './login-sign-up-routing.module';
import { LoginSignUpContainerComponent } from './components/login-sign-up-container/login-sign-up-container.component';
import { LoginSignUpBodyComponent } from './components/login-sign-up-body/login-sign-up-body.component';


@NgModule({
  declarations: [
    LoginSignUpContainerComponent,
    LoginSignUpBodyComponent
  ],
  imports: [
    CommonModule,
    LoginSignUpRoutingModule
  ]
})
export class LoginSignUpModule { }
