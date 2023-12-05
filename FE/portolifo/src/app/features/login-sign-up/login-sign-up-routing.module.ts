import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginSignUpContainerComponent } from './components/login-sign-up-container/login-sign-up-container.component';

const routes: Routes = [
  {
    path: 'login',
    component: LoginSignUpContainerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LoginSignUpRoutingModule { }
