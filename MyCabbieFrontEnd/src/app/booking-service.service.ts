import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Booking } from './booking.model'; // Adjust the path as necessary

@Injectable({
  providedIn: 'root'
})

export class BookingServiceService {
  private apiUrl = 'http://localhost:8081/book';
  
  constructor(private http: HttpClient) { }
  
  // Method to create a booking
  createBooking(booking: Booking): Observable<Booking> {
    // Optionally exclude properties like totalFare
    const { bookingId, totalFare, ...bookingData } = booking; // Exclude totalFare if needed
    return this.http.post<Booking>(this.apiUrl, bookingData);
  }
}
