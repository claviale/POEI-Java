import { Routes } from '@angular/router';
import { MessagerieComponent } from './components/messagerie/messagerie.component';
import { AccueilComponent } from './components/accueil/accueil.component';
import { InscriptionComponent } from './components/inscription/inscription.component';
import { authenticatedGuard } from './guard/authenticated.guard';

export const routes: Routes = [
    { path: "messagerie", component: MessagerieComponent, canActivate: [authenticatedGuard]},
    { path: "accueil", component: AccueilComponent },
    { path: "inscription", component: InscriptionComponent },
    { path: "**", redirectTo: "/accueil" }
];
