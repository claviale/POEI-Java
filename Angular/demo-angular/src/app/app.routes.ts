import { Routes } from '@angular/router';
import { CycleDeVieComponent } from './components/cycle-de-vie/cycle-de-vie.component';
import { DatabindingComponent } from './components/databinding/databinding.component';
import { FormulaireAjoutComponent } from './components/demo-services/formulaire-ajout/formulaire-ajout.component';
import { LectureComponent } from './components/demo-services/lecture/lecture.component';
import { DirectivesComponent } from './components/directives/directives.component';
import { ParentComponent } from './components/input/parent/parent.component';
import { RecepteurRouteComponent } from './components/recepteur-route/recepteur-route.component';
import { veloAtteignableGuard } from './guards/velo-atteignable.guard';
import { ApiComponent } from './components/api/api.component';

export const routes: Routes = [
    { path: "cycle-de-vie", component: CycleDeVieComponent },
    { path: "databinding", component: DatabindingComponent },
    { path: "demo-service/ajout", component: FormulaireAjoutComponent },
    { path: "demo-service/lecture", component: LectureComponent },
    { path: "directives", component: DirectivesComponent },
    { path: "input", component: ParentComponent },
    { path: "api", component: ApiComponent },
    { path: "recepteur/:id", component: RecepteurRouteComponent, canActivate: [veloAtteignableGuard] },
    { path: "**", redirectTo: "/cycle-de-vie" }
];
