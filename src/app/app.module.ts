import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { ClienteComponent } from './component/cliente/cliente.component';
import { DirectivaComponent } from './component/directiva/directiva.component';
import { PetsComponent } from './component/pets/pets.component';
import { HttpClientModule } from '@angular/common/http';



// Services
import { ClienteService } from './component/cliente/cliente.service';
import { PetsService } from './component/pets/pets.service';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    DirectivaComponent,
    ClienteComponent,
    PetsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [
    ClienteService,
    PetsService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
