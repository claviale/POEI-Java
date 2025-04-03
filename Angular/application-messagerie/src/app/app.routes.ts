import { Routes } from '@angular/router';
import { MessagerieComponent } from './components/messagerie/messagerie.component';
import { AccueilComponent } from './components/accueil/accueil.component';
import { InscriptionComponent } from './components/inscription/inscription.component';

export const routes: Routes = [
    { path: "messagerie", component: MessagerieComponent },
    { path: "accueil", component: AccueilComponent },
    { path: "inscription", component: InscriptionComponent },
    { path: "**", redirectTo: "/accueil" }
];
