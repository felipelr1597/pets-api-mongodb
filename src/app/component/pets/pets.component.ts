import { Component, OnInit } from '@angular/core';
import { PetsService } from './pets.service';
import { Pets } from './Pets';


@Component({
  selector: 'app-pets',
  templateUrl: './pets.component.html',
})
export class PetsComponent implements OnInit {

  pets: Pets[];
  constructor(private petsService: PetsService) {

   }

  ngOnInit() {
    this.petsService.getPets().subscribe(
      (response) => this.pets = response
    );
    console.log(this.pets);
  }

}
