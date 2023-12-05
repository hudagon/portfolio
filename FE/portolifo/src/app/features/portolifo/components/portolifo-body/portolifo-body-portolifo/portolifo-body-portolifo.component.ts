import { Component } from '@angular/core';

@Component({
  selector: 'app-portolifo-body-portolifo',
  templateUrl: './portolifo-body-portolifo.component.html',
  styleUrls: ['./portolifo-body-portolifo.component.css']
})
export class PortolifoBodyPortolifoComponent {
  toggleFilter() {
    const mobileFilterContent = document.getElementById('mobileFilterContent');

    if (mobileFilterContent) {
      mobileFilterContent.style.display = mobileFilterContent.style.display == '' ? 'flex' : '';
    }
  }
}
