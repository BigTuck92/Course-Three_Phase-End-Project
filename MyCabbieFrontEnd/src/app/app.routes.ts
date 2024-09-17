import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CabBookingComponent } from './cab-booking/cab-booking.component';
import { CabFareComponent } from './cab-fare/cab-fare.component';

export const routes: Routes = [
    {
        path: "",
        component: AppComponent,
        title: "Home Page"
    },
    {
        path: "cab-booking",
        component: CabBookingComponent,
        title: "Cab Booking"
    },
    {
        path: "cab-fare",
        component: CabFareComponent,
        title: "Cab Fare"
    }
];
