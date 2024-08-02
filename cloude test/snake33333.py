import pygame
import random

# Initialize Pygame
pygame.init()

# Set up the game window
WINDOW_WIDTH = 800
WINDOW_HEIGHT = 600
WINDOW = pygame.display.set_mode((WINDOW_WIDTH, WINDOW_HEIGHT))
pygame.display.set_caption("Snake Game")

# Define colors
BLACK = (0, 0, 0)
GREEN = (0, 255, 0)
RED = (255, 0, 0)
WHITE = (255, 255, 255)

# Set up the snake
SNAKE_SIZE = 10
SNAKE_X = WINDOW_WIDTH // 2
SNAKE_Y = WINDOW_HEIGHT // 2
SNAKE_SPEED = 10
SNAKE_DX = SNAKE_SPEED  # Initial movement to the right
SNAKE_DY = 0
SNAKE_BODY = [(SNAKE_X, SNAKE_Y)]

# Set up the food
FOOD_X = random.randrange(SNAKE_SIZE, WINDOW_WIDTH - SNAKE_SIZE, SNAKE_SIZE)
FOOD_Y = random.randrange(SNAKE_SIZE, WINDOW_HEIGHT - SNAKE_SIZE, SNAKE_SIZE)

# Game variables
clock = pygame.time.Clock()
game_over = False
score = 0

# Game loop
while not game_over:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_over = True
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_UP and SNAKE_DY == 0:  # Can't reverse direction vertically
                SNAKE_DX = 0
                SNAKE_DY = -SNAKE_SPEED
            elif event.key == pygame.K_DOWN and SNAKE_DY == 0:
                SNAKE_DX = 0
                SNAKE_DY = SNAKE_SPEED
            elif event.key == pygame.K_LEFT and SNAKE_DX == 0:  # Can't reverse direction horizontally
                SNAKE_DX = -SNAKE_SPEED
                SNAKE_DY = 0
            elif event.key == pygame.K_RIGHT and SNAKE_DX == 0:
                SNAKE_DX = SNAKE_SPEED
                SNAKE_DY = 0

    # Move the snake
    SNAKE_X += SNAKE_DX
    SNAKE_Y += SNAKE_DY

    # Check for collision with walls
    if SNAKE_X < 0 or SNAKE_X >= WINDOW_WIDTH or SNAKE_Y < 0 or SNAKE_Y >= WINDOW_HEIGHT:
        game_over = True

    # Check for collision with itself
    if (SNAKE_X, SNAKE_Y) in SNAKE_BODY[:-1]:
        game_over = True

    # Add new head to snake's body
    SNAKE_BODY.append((SNAKE_X, SNAKE_Y))

    # Check if the snake eats the food
    if SNAKE_X == FOOD_X and SNAKE_Y == FOOD_Y:
        score += 1
        FOOD_X = random.randrange(SNAKE_SIZE, WINDOW_WIDTH - SNAKE_SIZE, SNAKE_SIZE)
        FOOD_Y = random.randrange(SNAKE_SIZE, WINDOW_HEIGHT - SNAKE_SIZE, SNAKE_SIZE)
    else:
        SNAKE_BODY.pop(0)  # Remove the tail

    # Clear the screen
    WINDOW.fill(BLACK)

    # Draw the snake
    for segment in SNAKE_BODY:
        pygame.draw.rect(WINDOW, GREEN, (segment[0], segment[1], SNAKE_SIZE, SNAKE_SIZE))

    # Draw the food
    pygame.draw.rect(WINDOW, RED, (FOOD_X, FOOD_Y, SNAKE_SIZE, SNAKE_SIZE))

    # Update the display
    pygame.display.update()

    # Control the game speed
    clock.tick(15)  # Adjust the speed as needed

# Display game over message
font = pygame.font.Font(None, 36)
text = font.render(f"Game Over! Score: {score}", True, WHITE)
text_rect = text.get_rect(center=(WINDOW_WIDTH // 2, WINDOW_HEIGHT // 2))
WINDOW.blit(text, text_rect)
pygame.display.update()

# Wait for a moment before closing the window
pygame.time.wait(2000)

# Quit Pygame
pygame.quit()
