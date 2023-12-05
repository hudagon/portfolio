import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PortolifoRoutingModule } from './portolifo-routing.module';
import { PortolifoBodyComponent } from './components/portolifo-body/portolifo-body.component';
import { PortolifoSidebarComponent } from './components/portolifo-sidebar/portolifo-sidebar.component';
import { PortolifoContainerComponent } from './components/portolifo-container/portolifo-container.component';
import { PortolifoBodyAboutComponent } from './components/portolifo-body/portolifo-body-about/portolifo-body-about.component';
import { PortolifoBodyResumeComponent } from './components/portolifo-body/portolifo-body-resume/portolifo-body-resume.component';
import { PortolifoBodyBlogComponent } from './components/portolifo-body/portolifo-body-blog/portolifo-body-blog.component';
import { PortolifoBodyContractComponent } from './components/portolifo-body/portolifo-body-contract/portolifo-body-contract.component';
import { PortolifoBodyPortolifoComponent } from './components/portolifo-body/portolifo-body-portolifo/portolifo-body-portolifo.component';
import { SharedModule } from 'src/app/shared/shared.module';

@NgModule({
  declarations: [
    PortolifoBodyComponent,
    PortolifoSidebarComponent,
    PortolifoContainerComponent,
    PortolifoBodyAboutComponent,
    PortolifoBodyResumeComponent,
    PortolifoBodyBlogComponent,
    PortolifoBodyContractComponent,
    PortolifoBodyPortolifoComponent,
  ],
  imports: [
    CommonModule,
    PortolifoRoutingModule,
    SharedModule,
  ]
})
export class PortolifoModule { }
