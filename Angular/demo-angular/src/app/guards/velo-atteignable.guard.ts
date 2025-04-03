import { inject } from '@angular/core';
import { CanActivateFn } from '@angular/router';
import { VelosService } from '../services/velos.service';

export const veloAtteignableGuard: CanActivateFn = (route, state) => {
let id_param = route.paramMap.get("id");
if (id_param) {
  let id = Number.parseInt(id_param);
  let service = inject(VelosService);
  return id > -1 && id < service.getVelos().length;
}

  return false;
};
