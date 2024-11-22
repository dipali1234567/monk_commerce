package com.monk.commerce.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupons")
public class CouponController {

    @PostMapping(value="/")
    public ResponseEntity<?> createCoupon(@RequestBody Object coupon) {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping(value="/{couponId}")
    public ResponseEntity<?> updateCoupon(@RequestBody Object coupon, @PathVariable(value = "couponId") int id) {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping(value="/{couponId}")
    public ResponseEntity<?> deleteCoupon( @PathVariable(value = "couponId") int id) {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(value="/{couponId}")
    public ResponseEntity<?> getCoupon( @PathVariable(value = "couponId") int id) {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(value="/")
    public ResponseEntity<?> getCoupons() {
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
