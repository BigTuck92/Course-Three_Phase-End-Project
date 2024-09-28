import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BookingServiceService } from './booking-service.service';
import { Booking } from './booking.model';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  // title = 'MyCabbieFrontEnd';

  booking: Booking = {
    bookingId: 0, // Or any default value
    cabRate: 0,
    distance: 0,
    totalFare: 0, // This can be omitted or left as 0
  };

  constructor(private bookingService: BookingServiceService) {}

  calculateTotalFare(): number {
    return this.booking.cabRate * this.booking.distance;
  }

  submitBooking() {
    this.booking.totalFare = this.calculateTotalFare();

    this.bookingService.createBooking(this.booking).subscribe({
      next: (response) => {
        console.log('Booking created:', response);
        // Optionally reset the form or show a success message
        this.showSuccessMessage(`Booking Created Successfully, projected fare is $${this.booking.totalFare}`);
        this.resetForm();
      },
      error: (error) => {
        console.error('Error creating booking:', error);
      }
    });
  }

  showSuccessMessage(message: any){
    alert(message);
  }

  resetForm() {
    this.booking = {
      bookingId: 0, // Or any default value
      cabRate: 0,
      distance: 0,
      totalFare: 0,
    };
  }
}
