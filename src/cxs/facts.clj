(ns
  cxs.facts)

;; Property type
(def location {"Home" 50
               "Rent" 40
               "Community" 30
               "Relatives" 15
               "Millitary" 10})

;; Citizenship
(def citizenship {"Citizen" 100
                  "Other" 20
                  "Not resident" -100})
;;
(def family-status {"Single" 50
                    "Marriage" 100
                    "Divorced" 20
                    "Widow" 10})
;;
(def children {"No" 100
               "One" 80
               "Two" 20
               "More" 0})
;;
(def education {"Below" 10
                "Secondary" 20
                "Special" 30
                "Higher" 60
                "Several Higher" 80
                "Academic" 100})
;;
(def position {"Head" 90
               "Businessman" 100
               "Employer" 70
               "Military" 60
               "Special" 40
               "Sportsman" 30
               "Worker" 20
               "Student" 15
               "Pensioner" 10
               "Unemployed" -100})
;;
(def property {"House" 100
               "Apartment" 80
               "Camp" 60
               "Parcel" 40
               "Garage" 30
               "Other" 0})

