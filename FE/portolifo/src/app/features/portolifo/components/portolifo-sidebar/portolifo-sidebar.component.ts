import { Component } from '@angular/core';

@Component({
  selector: 'app-portolifo-sidebar',
  templateUrl: './portolifo-sidebar.component.html',
  styleUrls: ['./portolifo-sidebar.component.css']
})
export class PortolifoSidebarComponent {
  showContact() {
    const body = document.getElementById('body');
    const footer = document.getElementById('footer');

    if (body && footer) {
      body.style.display = body.style.display == '' ? 'flex' : '' ;
      footer.style.display = footer.style.display == '' ? 'flex' : '' ;
    }
  }
}
