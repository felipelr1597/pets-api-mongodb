import { Injectable } from '@angular/core';
import { Pets } from './Pets';
import { Observable, of } from 'rxjs';
import { NgIf } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Cliente } from '../cliente/cliente';



@Injectable({
  providedIn: 'root'
})
export class PetsService {

  private urlEndPoint: string = 'https://pets-api-mongodb.herokuapp.com/api/pets'
  constructor(private httpClient: HttpClient) { 

  }

  getPets(): Observable<Pets[]>{
    return this.httpClient.get<Pets[]>(this.urlEndPoint)

  }
}
