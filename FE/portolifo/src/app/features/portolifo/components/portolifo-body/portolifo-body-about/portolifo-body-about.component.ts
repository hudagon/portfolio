import { Component } from '@angular/core';

@Component({
  selector: 'app-portolifo-body-about',
  templateUrl: './portolifo-body-about.component.html',
  styleUrls: ['./portolifo-body-about.component.css']
})
export class PortolifoBodyAboutComponent {
  showModal: boolean = false;

  toggleModal(): void {
    this.showModal = !this.showModal;
  }
}
