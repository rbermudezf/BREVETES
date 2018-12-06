import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SidebarService {

  menu: any[] = [
    // Menú principal
    { titulo: 'Principal',
      icono: 'mdi mdi-gauge',
      submenu: [
        { titulo: 'Dashboard', url: '/dashboard' },
        { titulo: 'ProgressBar', url: '/progress' },
        { titulo: 'Gráficas', url: '/graficas1' }
      ] },

    // Menú documentos
    { titulo: 'Documentos',
      icono: 'mdi mdi-file-document',
      submenu: [
        { titulo: 'Registro de trámite', url: '/dashboard' },
        { titulo: 'Evaluación', url: '/progress' },
        { titulo: 'Informe', url: '/graficas1' },
        { titulo: 'Entrega de carnet', url: '/graficas1' }
      ] }
  ];

  constructor() { }
}
