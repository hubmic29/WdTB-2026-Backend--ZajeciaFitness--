# Schemat bazy danych

Plik generują reguły projektu (panel Maven → Lifecycle → verify). Nie edytujcie go ręcznie.

Tabele: 7 · kolumny: 38 · relacje: 5 × @ManyToOne, 1 × @OneToMany, 1 × @OneToOne, 0 × @ManyToMany

| Tabela | Encja | Kolumny | Klucze obce |
|---|---|---|---|
| Training_room | TrainingRoom | 5 | — |
| class_equipment | ClassEquipment | 5 | equipment_id, fitness_class_id |
| class_reservation | ClassReservation | 5 | fitness_class_id, member_id |
| equipment | Equipment | 5 | — |
| fitness_class | FitnessClass | 6 | room_id |
| member | Member | 7 | user_account_id |
| user_account | UserAccount | 5 | — |

```mermaid
erDiagram
    Training_room {
        Long id PK
        Boolean active
        Integer capacity
        Integer floor
        String name
    }
    class_equipment {
        Long id PK
        Long equipment_id FK
        Long fitness_class_id FK
        String notes
        Integer quantity
    }
    class_reservation {
        Long id PK
        LocalDateTime booked_at
        Boolean confirmed
        Long fitness_class_id FK
        Long member_id FK
    }
    equipment {
        Long id PK
        Boolean available
        String brand
        String name
        Integer total_stock
    }
    fitness_class {
        Long id PK
        ClassCategory category
        BigDecimal price
        Long room_id FK
        LocalDateTime starts_at
        String title
    }
    member {
        Long id PK
        String contact_name
        String contact_phone
        String full_name
        LocalDate joined_on
        String phone
        Long user_account_id FK
    }
    user_account {
        Long id PK
        LocalDateTime created_at
        String display_name
        String email
        AccountRole role
    }
    Training_room ||--o{ fitness_class : "room_id"
    equipment ||--o{ class_equipment : "equipment_id"
    fitness_class ||--o{ class_equipment : "fitness_class_id"
    fitness_class ||--o{ class_reservation : "fitness_class_id"
    member ||--o{ class_reservation : "member_id"
    user_account |o--o| member : "user_account_id"
```
