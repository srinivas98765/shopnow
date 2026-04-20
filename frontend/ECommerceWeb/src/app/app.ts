import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DemoAngularMaterailModule } from './DemoAngularMaterialModule';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,DemoAngularMaterailModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ECommerceWeb');
}
