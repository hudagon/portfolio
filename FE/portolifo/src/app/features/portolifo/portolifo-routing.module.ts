import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PortolifoContainerComponent } from './components/portolifo-container/portolifo-container.component';
import { PortolifoBodyAboutComponent } from './components/portolifo-body/portolifo-body-about/portolifo-body-about.component';
import { PortolifoBodyResumeComponent } from './components/portolifo-body/portolifo-body-resume/portolifo-body-resume.component';
import { PortolifoBodyPortolifoComponent } from './components/portolifo-body/portolifo-body-portolifo/portolifo-body-portolifo.component';
import { PortolifoBodyBlogComponent } from './components/portolifo-body/portolifo-body-blog/portolifo-body-blog.component';
import { PortolifoBodyContractComponent } from './components/portolifo-body/portolifo-body-contract/portolifo-body-contract.component';

const routes: Routes = [
  {
    path: '',
    component: PortolifoContainerComponent,
    children: [
      {
        path: 'about', component: PortolifoBodyAboutComponent
      },
      {
        path: 'resume', component: PortolifoBodyResumeComponent
      },
      {
        path: 'portolifo', component: PortolifoBodyPortolifoComponent
      },
      {
        path: 'blog', component: PortolifoBodyBlogComponent
      },
      {
        path: 'contract', component: PortolifoBodyContractComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PortolifoRoutingModule { }
