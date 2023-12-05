import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'feature',
    children: [
      {
        path: 'portfolio', loadChildren: () => import('./features/portolifo/portolifo.module').then(m => m.PortolifoModule)
      }
    ]
  },
  {
    path: 'auth',
    loadChildren: () => import('./features/login-sign-up/login-sign-up.module').then(m => m.LoginSignUpModule)
  },
  {
    path: '**',
    redirectTo: 'auth/login',
    pathMatch: 'full'
  },
  {
    path: '',
    redirectTo: 'auth/login',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
