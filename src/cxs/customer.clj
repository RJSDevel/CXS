(ns
  cxs.customer
  (:use cxs.io)
  (:use cxs.facts)
  (:use cxs.rules))

;; Custumer struct
(def customer {
                :fio (prompt-read "Enter FIO" fio-rule)
                :bpl (prompt-read "Enter BPL" bpl-rule)
                :age (prompt-read-int "Enter Age" age-rule)
                :experience (prompt-read-int "Enter Experience" experiens-rule)
                :profit (prompt-read-int "Enter Profit" profit-rule)
                :location (prompt-read-variants "Select Location" location)
                :citizenship (prompt-read-variants "Select Sitizenship" citizenship)
                :family-status (prompt-read-variants "Select Family Status" family-status)
                :children (prompt-read-variants "Select Children Count" children)
                :education (prompt-read-variants "Select Education" education)
                :position (prompt-read-variants "Select Position" position)
                :property (prompt-read-variants "Select Property" property)})