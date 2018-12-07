import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

// Llamar script desde fuera
declare function init_plugins();

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: [ './login.component.css' ]
})
export class LoginComponent implements OnInit {

  constructor( public router: Router ) { }

  ngOnInit() {
    init_plugins();
  }

  ingresar() {
    // Permite navegar al dashboard
    this.router.navigate( ['dashboard'] );
  }
}
