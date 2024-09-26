package kiet.imam.wishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {

    suspend fun addWish(wish: Wish){
        wishDao.addWish(wish)
    }
    fun getWishes() : Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id:Long) :Flow<Wish>{
        return wishDao.getAWishById(id)
    }
    suspend fun updateAWish(wish:Wish){
        return wishDao.updateAWish(wish)

    }
    suspend fun deleteAWish(wish: Wish){
        return wishDao.deleteAWish(wish)
    }

}