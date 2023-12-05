import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ModalComponent } from './components/modal/modal.component';
import { LoaderComponent } from './components/loader/loader.component';
import { ToastComponent } from './components/toast/toast.component';



@NgModule({
  declarations: [
    ModalComponent,
    LoaderComponent,
    ToastComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [ModalComponent, LoaderComponent, ToastComponent]
})
export class SharedModule { }
