import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [],
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit{
  public products:  any;
  constructor(private http:HttpClient) {
  }
  ngOnInit(){
     this.http.get("http://localhost:8082/api/products")
       .subscribe({
         next:data=>{
           this.products=data;
         },
         error :err => {
           console.log(err);
         }
       })
  }
}
