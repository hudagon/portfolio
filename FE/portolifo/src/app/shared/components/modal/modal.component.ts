import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent {
  @Output() toggleModal = new EventEmitter<void>();

  closeModal(): void {
    this.toggleModal.emit();
  }
}
