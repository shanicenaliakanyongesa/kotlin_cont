from django.db import models
class Trainer(models.Model):
        trainer_id = models.AutoField(primary_key=True)
        name = models.CharField(max_length=30)
        address = models.CharField(max_length=50)
        city = models.CharField(max_length=60)
        state_province = models.CharField(max_length=30)
        country = models.CharField(max_length=50)
        website = models.URLField()
        email = models.EmailField()

        def __str__(self):
            return self.name


class Club(models.Model):
        club_id = models.AutoField(primary_key=True)
        club_name = models.CharField(max_length=30)
        
        def __str__(self):
            return self.club_name


class Player(models.Model):
        player_id = models.AutoField(primary_key=True)
        first_name = models.CharField(max_length=100)
        last_name = models.CharField(max_length=100)
        age = models.IntegerField()
        address = models.CharField(max_length=50)
        email = models.EmailField()
        trainer_id = models.ForeignKey(Trainer, on_delete=models.CASCADE)
        club_id = models.ForeignKey(Club, on_delete=models.CASCADE)
        dob = models.DateField()

        def __str__(self):
            return self.first_name
        

class Payment(models.Model):
        payment_id = models.AutoField(primary_key=True)
        month = models.CharField(max_length=30)
        paid_for = models.CharField(max_length=30)
        amount = models.IntegerField()
        player_id = models.ForeignKey(Player, on_delete=models.CASCADE)

        
        def __str__(self):
            return self.paid_for
        


class TrainingKitCollection(models.Model):
        kit_id = models.AutoField(primary_key=True)
        kit_name = models.CharField(max_length=30)
        player_id = models.ForeignKey(Player, on_delete=models.CASCADE)
        collection_date = models.DateField()
        
        
        def __str__(self):
            return self.kit_name     
